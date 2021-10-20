package labs_examples.conditions_loops.labs;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Test {

        public static void main(String[] args) {
            // please demonstrate the use of the "continue" keyword below within a for loop
            for (int i = 0; i < 10; i++) {
                if (i % 3 == 0) {
                    continue;
                }
                System.out.println(i);
            }
            int count =0;
            do {

                if (count % 2 != 0) {
                    System.out.println(count);
                    if(count ==5){
                        break;
                    }

                }
                count++;
            } while (count <= 10) ;



            // please demonstrate the use of the "break" keyword below in a do-while loop
        }
        }

