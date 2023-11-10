import java.util.*;

public class ex13{
    public static class FavoriteClasses<ClassA,ClassB,ClassC>{
        private ClassA favorite1;
        private ClassB favorite2;
        private ClassC favorite3;
        FavoriteClasses(ClassA fav1, ClassB fav2, ClassC fav3){
            this.favorite1=fav1;
            this.favorite2=fav2;
            this.favorite3=fav3;
        }
        public ClassA getFav1(){
            return(this.favorite1);
        }
        public ClassB getFav2(){
            return(this.favorite2);
        }
        public ClassC getFav3(){
            return(this.favorite3);
        }
    }
    public static void main(String[] args){
        List<Double> r=new ArrayList<>();
        r.add(6.3);
        r.add(5.9);
        FavoriteClasses<String, Integer, Double> a=new FavoriteClasses<>("Hello",67,r.get(0));
        System.out.println("My favorites are " + a.getFav1() + ", "+ a.getFav2() + ", and " + a.getFav3() + ".");
    }
}