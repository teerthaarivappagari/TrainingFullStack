class AuthenticationUsingInnerClass {
     private String password = "securePass";
      class AuthCheck { 
        boolean validate(String input) {
             return input.equals(password);
             }
             }
        public static void main(String[] args) {
             AuthenticationUsingInnerClass auth = new AuthenticationUsingInnerClass();
              AuthenticationUsingInnerClass.AuthCheck check = auth.new AuthCheck();
               System.out.println("Authentication: " + check.validate("securePass"));
             }
             }
