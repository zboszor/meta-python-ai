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

