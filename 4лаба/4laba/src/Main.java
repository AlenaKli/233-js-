public class Main {
    public static void main(String[] args) {
        String input = "Ля ля топол1, я так устала бл2 бла бла!";

        // Разделяем строку на слова-по пробелам
        String[] words = input.split("\\s+");

        // Проходим по каждому слову
        for (String word : words) {
            // Если слово содержит цифры или знаки пунктуации,первое цифры,второе символы пунктуации
            if (word.matches(".*[\\d\\p{P}].*")) {
                System.out.println(word);
            }
        }
    }
}