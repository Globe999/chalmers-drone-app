# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.16

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/jesper/Documents/gitz/util/C/isoObject

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/jesper/Documents/gitz/util/C/isoObject/build

# Include any dependencies generated for this target.
include CMakeFiles/ISO_objectDemo.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/ISO_objectDemo.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/ISO_objectDemo.dir/flags.make

CMakeFiles/ISO_objectDemo.dir/demoIsoObject.cpp.o: CMakeFiles/ISO_objectDemo.dir/flags.make
CMakeFiles/ISO_objectDemo.dir/demoIsoObject.cpp.o: ../demoIsoObject.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/jesper/Documents/gitz/util/C/isoObject/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/ISO_objectDemo.dir/demoIsoObject.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/ISO_objectDemo.dir/demoIsoObject.cpp.o -c /home/jesper/Documents/gitz/util/C/isoObject/demoIsoObject.cpp

CMakeFiles/ISO_objectDemo.dir/demoIsoObject.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/ISO_objectDemo.dir/demoIsoObject.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/jesper/Documents/gitz/util/C/isoObject/demoIsoObject.cpp > CMakeFiles/ISO_objectDemo.dir/demoIsoObject.cpp.i

CMakeFiles/ISO_objectDemo.dir/demoIsoObject.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/ISO_objectDemo.dir/demoIsoObject.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/jesper/Documents/gitz/util/C/isoObject/demoIsoObject.cpp -o CMakeFiles/ISO_objectDemo.dir/demoIsoObject.cpp.s

# Object files for target ISO_objectDemo
ISO_objectDemo_OBJECTS = \
"CMakeFiles/ISO_objectDemo.dir/demoIsoObject.cpp.o"

# External object files for target ISO_objectDemo
ISO_objectDemo_EXTERNAL_OBJECTS =

ISO_objectDemo: CMakeFiles/ISO_objectDemo.dir/demoIsoObject.cpp.o
ISO_objectDemo: CMakeFiles/ISO_objectDemo.dir/build.make
ISO_objectDemo: libISO_object.so
ISO_objectDemo: iso22133/libISO22133.so
ISO_objectDemo: CMakeFiles/ISO_objectDemo.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/jesper/Documents/gitz/util/C/isoObject/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable ISO_objectDemo"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/ISO_objectDemo.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/ISO_objectDemo.dir/build: ISO_objectDemo

.PHONY : CMakeFiles/ISO_objectDemo.dir/build

CMakeFiles/ISO_objectDemo.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/ISO_objectDemo.dir/cmake_clean.cmake
.PHONY : CMakeFiles/ISO_objectDemo.dir/clean

CMakeFiles/ISO_objectDemo.dir/depend:
	cd /home/jesper/Documents/gitz/util/C/isoObject/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/jesper/Documents/gitz/util/C/isoObject /home/jesper/Documents/gitz/util/C/isoObject /home/jesper/Documents/gitz/util/C/isoObject/build /home/jesper/Documents/gitz/util/C/isoObject/build /home/jesper/Documents/gitz/util/C/isoObject/build/CMakeFiles/ISO_objectDemo.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/ISO_objectDemo.dir/depend

