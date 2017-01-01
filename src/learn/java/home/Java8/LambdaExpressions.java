package learn.java.home.Java8;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.File;
import java.io.FileFilter;

/**
  * Lambda Expressions используются в первую очередь для того, чтобы сделать
  * запись анонимного класса более простой, а также более простым для чтения.
  * Анонимный класс - класс который создаетс в методе и используется там же
  * не выходя за границы. Он не имеет названия.
  * Программа без лямбда выражения выглядит так:
  *
  *     FileFilter fileFilter = new FileFilter() {
  *         @Override
  *          public boolean accept(File file) {
  *          return file.getName().endsWith(".java");
  *          }
  *  };
  *
  * Для того чтобы использовать Lambda Expression мы:
  * 1. Берем из public boolean accept(File file) аргументы (File file);
  * 2. Затем добавляем ->;
  * 3. Вставляем блок после слова return, без слова return.
  */

public class LambdaExpressions {
    public static void main(String[] args) {
//      Когда мы наследуем интерфейс всегда есть необходимость переопределять метод,
//      чтобы упростить запись можно использовать лямбда выражение как показано ниже
        FileFilter fileFilter = (File file) -> file.getName().endsWith(".java");
        File dir = new File("");
        File[] files = dir.listFiles(fileFilter);

        for (File f : files) {
            System.out.println(f);
        }
    }
}
