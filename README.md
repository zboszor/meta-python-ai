# meta-python-ai

This Yocto layer contains artificial intelligence / machine learning related Python module recipes.

This Yocto layer is also the continuation and extension of:

* [meta-scipy](https://github.com/tuxable-ltd/meta-scipy)
* [meta-scikit-learn](https://github.com/tuxable-ltd/meta-scikit-learn)

Installation
------------

You will need to enable FORTRAN support by adding the following to your
`local.conf` file if you want to cross-compile python3-scipy:

    FORTRAN:forcevariable = ",fortran"
    RUNTIMETARGET:append:pn-gcc-runtime = " libquadmath"
    HOSTTOOLS += "gfortran"

If you're using a custom distribution, you can alternatively include the
above lines in your `distro.conf` file.

The OpenBLAS recipe in this layer has its default configuration carried
over from [meta-scikit-learn](https://github.com/tuxable-ltd/meta-scikit-learn).
But it is not enough to satisfy the `python3-scipy` recipe. To allow
`python3-scipy` build and work, this settings is needed in an
`openblas_%.bbappend`:

    PACKAGECONFIG = "lapack cblas affinity dynarch"

The recently added `python3-llvmlite` (https://pypi.org/project/llvmlite/)
recipe needs LLVM 14.x but can also build with LLVM 15.x as an experimental
change. The llvmlite project is quite slow to adopt newer LLVM versions,
so if you need this package and want to build it in Yocto 4.3 or newer,
then please use [meta-clang-revival](https://github.com/zboszor/meta-clang-revival)
in your manifest.
