## What inside?
1. implemented the Get method only and handle it's exception.
2. "/test" is used for Request mapping.
3. "/test/" or "/test/home" path used for the giving some response about the api.
4. "/students" - use when you need all student
5. "/students/{studentId}" - use when you want a specific student using student index (0,1,2,3). eg: **/students/1**
6. Go and try with invalid value in path(URI) on any **REST Client** and check the Expection handle.
