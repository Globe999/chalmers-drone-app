if(EXISTS "/home/jesper/Documents/gitz/Android-GSDemo-GoogleMap/GSDemo/app/.cxx/Debug/1j2x6p13/arm64-v8a/iso22133/ISO22133_test[1]_tests.cmake")
  include("/home/jesper/Documents/gitz/Android-GSDemo-GoogleMap/GSDemo/app/.cxx/Debug/1j2x6p13/arm64-v8a/iso22133/ISO22133_test[1]_tests.cmake")
else()
  add_test(ISO22133_test_NOT_BUILT ISO22133_test_NOT_BUILT)
endif()