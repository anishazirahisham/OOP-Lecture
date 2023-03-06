public class Name {
    

    private String fname; //static keyword means that the variable belongs to the class, not to a particular instance of the class.
    private String mname;
    private String lname;
    private String fullName; //private = cannot access outside the class
    //setting fullname static means that all instances of the 
    //class share the same 'fullname' attribute. will cause problem if create multiple 
    //'Name' objects and set their full names independently.

    public Name(String fullName){
        String[] name = fullName.split(" "); //name array, split with space " "
        if(name.length == 1){
            fname = name[0];
        }
        else if(name.length == 2){
            fname = name[0];
            lname = name[1];
        }
        else{
            fname = name[0];
            lname = name[name.length - 1];
            mname = "";
            for(int i=1; i<name.length-1; i++){
                mname = mname + name[i] + " ";
            }
        }
        this.fullName = fullName;
    }

    public String getFullName(){ //get the attribute from Name object
        return fullName;
    }

    public String getFname(){
        return fname;
    }

    public String getMname(){
        return mname;
    }
    
    public String getLname(){
        return lname;
    }

    public void setFName(String fname){ //set value of first ame attribute of a Name object
        this.fname = fname;
    }
    
    public void setMName(String mname){
        this.mname = mname;
    }

    public void setLName(String lname){
        this.lname = lname;
    }

}
