Copyright 2015 Martin Winandy

Licensed under the Apache License, Version 2.0 (the "License"); you may not use
this file except in compliance with the License. You may obtain a copy of the
License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed
under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.


=====================
 Using SLF4J Binding
=====================

1) Download tinylog and Apache Commons Logging (JCL)

2) Add "commons-logging.jar", "jcl-binding.jar" and "tinylog.jar" to your classpath

3) Optionally attach "jcl-binding-javadoc.jar" for Javadoc documentation and
   "jcl-binding-sources.jar" for source code attachment

4) Now you can test the logger facade by the following simple program:

      import org.apache.commons.logging.Log;
      import org.apache.commons.logging.LogFactory;
 	  
      public class Application {
         public static void main(final String[] args) {
            Log log = LogFactory.getLog(Application.class);
            log.info("Hello World!");
         }
      }

   After compilation, try it out by issuing the command

      java Application
  
   You should see a log statement appearing on the console.

5) A detailed user manual can be found on http://www.tinylog.org/
