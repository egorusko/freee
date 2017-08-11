package Chapter_6.Access_modifiers;
//демонстрация методов которые принимают объекты
public class BlockDemo {
    public static void main(String[] args) {
        Block block1 = new Block(1,2,3);
        Block block2 = new Block(1,2,3);
        Block block3 = new Block(3,1,3);

        System.out.println(block1.someBlock(block2));//true
        System.out.println(block1.someBlock(block3));//false
        System.out.println(block1.someVolume(block2));//true
        System.out.println(block1.someVolume(block3));//false
    }


}
