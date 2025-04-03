class UserData { 
    private String username; 
    private String password;
    public void setCredentials(String user, String pass) {
         this.username = user;
          this.password = pass;
         }
     public String getUsername() {
         return username; 
        }
        public String getPassword() {
            return password; 
           }
        }
        class UserDataEncapsulation extends UserData{

    public static void main(String[] args) {
         UserDataEncapsulation  u = new UserDataEncapsulation ();
        u.setCredentials("JohnDoe", "password123");
        System.out.println("User: " + u.getUsername()
        );
        
     }
     }

