import org.junit.jupiter.api.Test;

import static org.Assert.*;

class ImplementacionCalcuTest {




        public ImplementacionCalcuTest() {
        }


        public static void setUpClass() {
        }

        @AfterClass
        public static void tearDownClass() {
        }

        @Before
        public void setUp() {
        }

        @After
        public void tearDown() {
        }

     
        @Test
        public void testEvalArrayList() {
            System.out.println("arraylist");
            String s = "27+4*3+";
            Stack<String> stack = new StackArrayList<>();
            ImplementacionCalcu instance = ImplementacionCalcu.getInstance();
            int expResult = 39;
            int result = (int) instance.decode(int, stack);
            Equals(expResult, result, 0);
        }
        @Test
        public void testEvalVector() {
            System.out.println("vector");
            String s = "27+4*3+";
            Stack<String> stack = new StackVector<>();
            ImplementacionCalcu instance = ImplementacionCalcu.getInstance();
            int expResult = 39;
            int result = instance.decode(int, stack);
            Equals(expResult, result, 0.0);
        }
        @Test
        public void testEvalSingle() {
            System.out.println("single");
            String s = "39/5*2+";
            ListLinkedList<String> stack = new ListLinkedList<String>();
            ImplementacionCalcu instance = ImplementacionCalcu.getInstance();
            int expResult = (int) 17.0;
            int result = (int) instance.decode(int, stack);
            Equals(expResult, result, 0.0);
        }
        @Test
        public void testEvalDouble() {
            System.out.println("double");
            String s = "72-4*3+";
            ListDoubleLinkedList<String> stack = new ListDoubleLinkedList<String>();
            ImplementacionCalcu instance = ImplementacionCalcu.getInstance();
            int expResult = 23;
            int result = (int) instance.decode(int E, stack);
            Equals(expResult, result, 0);
        }
