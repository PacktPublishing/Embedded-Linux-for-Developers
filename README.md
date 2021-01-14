#Embedded Linux for Developers

This is the code repository for Embedded Linux for Developers, published by Packt. It contains all the supporting project files necessary to work through the course from start to finish.

##What you will learn

* Use the Yocto Project in the embedded Linux development process
* Get familiar with and customize the bootloader for a board
* Discover more about real-time layer, security, virtualization, CGL, and LSB
* See development workflows for the U-Boot and the Linux kernel, including debugging and optimization
* Understand the open source licensing requirements and how to comply with them when cohabiting with proprietary programs
* Optimize your production systems by reducing the size of both the Linux kernel and root filesystems 
* Understand device trees and make changes to accommodate new hardware on your device
* Design and write multi-threaded applications using POSIX threads
* Measure real-time latencies and tune the Linux kernel to minimize them

##Note
##Module 2

###Dependencies
============

This layer depends on:

  URI: git://git.yoctoproject.org/meta-fsl-arm
  branch: dizzy


###Patches
=======

Please submit any patches against the bsp-custom layer to Packt Publishing
via http://www.packtpub.com/submit-errata, or to the author Alex Gonzalez at
alex<at>lindusembedded.com

###Table of Contents
=================

  I. Adding the bsp-custom layer to your build
  
  II. Misc
 
###I. Adding the bsp-custom layer to your build
=================================================

In order to use this layer, you need to make the build system aware of
it.

Assuming the bsp-custom layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the bsp-custom layer to bblayers.conf, along with any
other layers needed. e.g.:

BBLAYERS = " \
	${BSPDIR}/sources/poky/meta \
	${BSPDIR}/sources/poky/meta-yocto \
	\
	${BSPDIR}/sources/meta-openembedded/meta-oe \
	${BSPDIR}/sources/meta-openembedded/meta-multimedia \
	\
	${BSPDIR}/sources/meta-fsl-arm \
	${BSPDIR}/sources/meta-fsl-arm-extra \
	${BSPDIR}/sources/meta-fsl-demos \
	${BSPDIR}/sources/meta-bsp-custom \
"

###II. Misc
========

This layer should be used in conjuntion with the "Embedded Linux Projects
Using Yocto Project Cookbook" published by Packt Publising in 2015.

The commits are named with the chapter and recipe number they belong to:

CH_N: Recipe title

where,

CH is the chapter number
N is the recipe number according to the list below.

Recipe list
-----------

####Chapter 1: The build system

1. Setting up the host system
2. Installing Poky
3. Creating a build directory
4. Building your first image
5. Explaining the Freescale's Yocto ecosystem
6. Installing support for Freescale's hardware
7. Building wandboard images
8. Troubleshooting your wandboard's first boot.
9. Configuring network booting for a development setup
10. Sharing downloads
11. Sharing the shared state cache
12. Setting up a package feed
13. Using build history
14. Working with build statistics
15. Debugging the build system

####Chapter 2: The BSP layer

16. Creating a custom BSP layer
17. Introducing system development workflows
18. Adding a custom kernel and bootloader
19. Building the u-boot bootloader.
20. Explaining Yocto's Linux kernel support
21. Describing Linux's build system
22. Configuring the Linux kernel
23. Building the Linux kernel
24. Building external kernel modules
25. Debugging the Linux kernel and modules
26. Debugging the Linux kernel booting process.
27. Using the kernel tracing system
28. Managing the device tree
29. Debugging device tree issues

####Chapter 3:  The software layer

30. Exploring an image contents
31. Adding a new software layer
32. Selecting specific package version and providers
33. Adding supported packages
34. Adding new packages
35. Adding data, scripts or configuration files
36. Managing users and groups
37. Using the sysvinit initialization system
38. Using the systemd initialization system
39. Installing package installation scripts
40. Reducing the Linux kernel image size
41. Reducing the root filesystem image size
42. Releasing software
43. Analyzing your system for compliance
44. Working with open source and proprietary code

####Chapter 4: Application development

45. Introducing toolchains
46. Preparing and using an SDK
47. Using the Application Development Toolkit
48. Using the Eclipse IDE
49. Developing GTK+ applications
50. Using the QT creator IDE
51. Developing QT applications
52. Describing workflows for application development
53. Working with GNU make
54. Working with the GNU build system
55. Working with the cmake build system
56. Working with the scons builder
57. Developing with libraries
58. Working with the Linux framebuffer
59. Using the X windows system
60. Using Wayland
61. Adding python applications
62. Integrating the Oracle Java Runtime Environment
63. Integrating the OpenJDK Java Development Kit
64. Integrating Java applications

####Chapter 5: Debugging, tracing and profiling

65.  Analyzing core dumps
66.  Native gdb debugging
67.  Cross gdb debugging
68.  Using strace for application debugging
69.  Using the kernel's performance counters
70.  Using static kernel tracing
71.  Using dynamic kernel tracing
72.  Using dynamic kernel events
73.  Exploring Yocto's tracing and profiling tools
74.  Tracing and profiling with perf
75.  Using systemtap
76.  Using oprofile
77.  Using LTTng
78.  Using blktrace

##Related Products

[Embedded Linux Development with Yocto Project](https://www.packtpub.com/application-development/embedded-linux-development-yocto-project?utm_source=github&utm_medium=repository&utm_campaign=9781783282333)

[Mastering Embedded Linux Programming](https://www.packtpub.com/networking-and-servers/mastering-embedded-linux-programming?utm_source=github&utm_medium=repository&utm_campaign=9781784392536)


[Click here](https://docs.google.com/forms/d/e/1FAIpQLSe5qwunkGf6PUvzPirPDtuy1Du5Rlzew23UBp2S-P3wB-GcwQ/viewform) if you have any feedback or suggestions.
