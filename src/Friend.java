public class Friend {
    //This is a STATIC int, because it is a static attribute, it is accessible WITHOUT an object
    //As opposed to creating friend1, it is just accessible from the whole class
    static int numOfFriends = 0;

    Friend(){
        numOfFriends++;
    }
}
