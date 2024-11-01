This README file contains information on the contents of the meta-mm5d91-gui layer.

Please see the corresponding sections below for details.

Table of Contents
=================

  I. Adding the meta-mm5d91-gui layer to your build
 II. Misc


I. Adding the meta-mm5d91-gui layer to your build
=================================================

git checkout scarthgap
Run 'bitbake-layers add-layer meta-mm5d91-gui'
remove links from <path to your yocto main source folder>/meta-mm5d91-gui/recipes-mm5d91-gui/mm5d91-gui/files/
link required files:
* ln -s <path to mm5d91-rpi4-driver folder>Makefile-gui <path to your yocto main source folder>/meta-mm5d91-gui/recipes-mm5d91-gui/mm5d91-gui/files/Makefile
* ln -s <path to mm5d91-rpi4-driver folder>/usertestapp.c <path to your yocto main source folder>/meta-mm5d91-gui/recipes-mm5d91-gui/mm5d91-gui/files/usertestapp.c
* ln -s <path to mm5d91-rpi4-driver folder>/mm5d91_ioctl.h <path to your yocto main source folder>/meta-mm5d91-gui/recipes-mm5d91-gui/mm5d91-gui/files/mm5d91_ioctl.h

II. Misc
========

branch scathgap
