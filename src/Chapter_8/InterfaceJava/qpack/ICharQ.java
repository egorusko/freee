package Chapter_8.InterfaceJava.qpack;
// Интерфейс для очереди символов
public interface ICharQ {
  // Поместить символ в очередь
    void put(char ch);

  // Извлечь символ из очереди
    char get();

  //сбросить очередь
    void reset();

}
