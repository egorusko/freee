package Chapter_6.Access_modifiers;
// Методам можно передавать объекты
class Block {
    int a,b,c;
    int volume;

    public Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.volume = a*b*c;
    }

    // Вернуть логическое значение true, если
    // параметр оЬ определяет тот же параллелепипед
    boolean someBlock(Block block){
        if (block.a == this.a & block.b ==this.b &
                block.c == this.c) return  true;
        else return false;
    }
    // Вернуть логическое значение true, если
    // параметры объема параллелепипедов совпадают
     boolean someVolume(Block block){
        return (block.volume == this.volume) ? true:false;
    }


}
