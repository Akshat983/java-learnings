package JavaByKK.OOPS.singleton;

public class user {
     Singleton ob1 = Singleton.getInstance();
     Singleton ob2 = Singleton.getInstance();
     Singleton ob3 = Singleton.getInstance();
    //here all ob1, ob2, ob3 refer to same object
    static void main() {
        user obb = new user();
        System.out.println(obb.ob1+" \n"+obb.ob2+" \n" + obb.ob3);
    }
}
