package Chapter_6.Access_modifiers;

/**
 * Класс служит для демонстрации модификаторов доступа
 * <b>alpfa</b> и <b>alpfa</b> и <b>gamma</b>.
 * @version 1.0
 * @autor Egor Zinovev
 */

class MyClass {

    private int alpfa; // close access
    public int beta; //open access
    int gamma; // default access (public)

    void setAlpfa(int alpfa) {
        this.alpfa = alpfa;
    }

    int getAlpfa() {
        return alpfa;
    }
}
