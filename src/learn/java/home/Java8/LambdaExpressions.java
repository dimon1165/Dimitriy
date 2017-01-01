package learn.java.home.Java8;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import learn.java.home.Collections.ComparatorLearn;

import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;

/**
 *
 * Lambda Expressions - это не объект, он назывется "object without its own identity".
 * He должен быть использован так как объект в джава.
 *
 * Lambda Expressions - это функциональный интерфейс (новое понятие в java8) - это
 * интерфейс который имеет всего один абстрактный метод. Абстрактный метод потому, что
 * в Java7 мы могли использовать только абстрактные методы в интерфейсе. К примеру Runnable interface
 * как и FileFilter являются функциональными интерфейсами.
 *
 * Функциональный интерфейс может иметь анотацию @FunctionalInterface
 *
 * Также выражение может быть:
 * - как параметер методаж
 * - может быть возвращаемым значением метода
 * - лямбда может быть помещена в переменную.
 * Например в переменную с:
 * Comparator<String> c = (String s1, String s2 )-> Integer.compare(s1.length(),s2.length());
 *
 * Lambda Expressions создается без использования ключевого слова "new". Это отличет лямбда инстанса
 * анонимного класса, когда используется лямбда выражение джавамашина не создает инстантс каждый раз.
 * Тоесть использование лямбда намного эффективнее.
 *
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

