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

If you're using a custom distribution, you can alternatively include the two
above lines in your `distro.conf` file.

The recently added `python3-llvmlite` (https://pypi.org/project/llvmlite/)
recipe needs LLVM 14.x but can also build with LLVM 15.x as an experimental
change. The llvmlite project is quite slow to adopt newer LLVM versions,
so if you need this package and want to build it in Yocto 4.3 or newer,
then please use these branches from the forked https://github.com/zboszor/meta-clang
until the relevant pull requests are merged:

* `nanbield-add-clang15` (https://github.com/kraj/meta-clang/pull/988)
* `scarthgap-add-clang15` (https://github.com/kraj/meta-clang/pull/989)
* `master-add-clang15` (https://github.com/kraj/meta-clang/pull/990)
