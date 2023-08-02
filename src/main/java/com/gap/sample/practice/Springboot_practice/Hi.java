//package com.gap.sample.practice.Springboot_practice;
//
//public class Hi {
//
//
//   // @Provider
////    @PreMatching
//    public class DirectoryTraversalFilter implements ContainerRequestFilter, ContainerResponseFilter {
//
//        private static final String DIRECTORY_TRAVERSAL_PATTERN = "\\.\\./|\\.\\.\\\\|\\\\\\.\\\\\\./|\\\\\\.\\\\./|\\\\\\.\\.|\\\\\\.";
//
//       // @Override
//        public void filter(ContainerRequestContext requestContext) throws IOException {
//            String requestPath = requestContext.getUriInfo().getPath();
//
//            if (requestPath.matches("." + DIRECTORY_TRAVERSAL_PATTERN + ".")) {
//                requestContext.abortWith(Response.status(Response.Status.FORBIDDEN).build());
//            }
//        }
//
////        @Override
//        public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
//                throws IOException {
//            // Implement response filtering if needed.
//        }
//    }
//}
