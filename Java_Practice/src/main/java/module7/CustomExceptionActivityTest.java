package module7;

public class CustomExceptionActivityTest {
    static void main(String[] args) {
        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();

        try {
            obj.validateUser("John");
            obj.validateUser("Mike");
            obj.validateUser("Anna");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
    }
}

void validateUser(String name) throws CustomExceptionActivity {
    String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

    int flag = 0;

    for (int i = 0; i < 4; i++) {

        if (validUsers[i].equals(name)) {
            flag = 1;
            break;
        }
    }

    if (flag == 0){
        throw new CustomExceptionActivity();
    } else {
        System.out.println("Welcome to Payroll program");
        }

    }
}