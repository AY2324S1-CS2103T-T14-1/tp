package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_DEPARTMENT_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DEPARTMENT_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ID_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ID_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ROLE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ROLE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_SALARY_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_SALARY_BOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withId("A000000").withName("Alice Pauline")
            .withEmail("alice@example.com").withPhone("94351253")
            .withDepartment("Finance").withRole("Intern").withSalary("1000").build();
    public static final Person BENSON = new PersonBuilder().withId("A000001").withName("Benson Meier")
            .withEmail("johnd@example.com").withPhone("98765432")
            .withDepartment("Marketing").withRole("Intern").withSalary("2000").build();
    public static final Person CARL = new PersonBuilder().withId("A000002").withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withDepartment("Sales").withRole("Admin staff").withSalary("3000").build();
    public static final Person DANIEL = new PersonBuilder().withId("A000003").withName("Daniel Meier")
            .withPhone("87652533")
            .withEmail("cornelia@example.com").withDepartment("Human Resources").withRole("Team Leader")
            .withSalary("4000").build();
    public static final Person ELLE = new PersonBuilder().withId("A000004").withName("Elle Meyer")
            .withPhone("9482224")
            .withEmail("werner@example.com").withDepartment("Accounting").withRole("Manager")
            .withSalary("5000")
            .build();
    public static final Person FIONA = new PersonBuilder().withId("A000005").withName("Fiona Kunz")
            .withPhone("9482427")
            .withEmail("lydia@example.com").withDepartment("Management").withRole("Manager").withSalary("6000")
            .build();
    public static final Person GEORGE = new PersonBuilder().withId("A000006").withName("George Best")
            .withPhone("9482442")
            .withEmail("anna@example.com").withDepartment("Finance").withRole("Executive").withSalary("7000")
            .build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withId("A000007").withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withDepartment("Marketing").withRole("Executive")
            .withSalary("8000").build();
    public static final Person IDA = new PersonBuilder().withId("A000008").withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withDepartment("Sales").withRole("Senior Executive")
            .withSalary("9000").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withId(VALID_ID_AMY).withName(VALID_NAME_AMY)
            .withPhone(VALID_PHONE_AMY).withEmail(VALID_EMAIL_AMY).withDepartment(VALID_DEPARTMENT_AMY)
            .withRole(VALID_ROLE_AMY).withSalary(VALID_SALARY_AMY).build();
    public static final Person BOB = new PersonBuilder().withId(VALID_ID_BOB).withName(VALID_NAME_BOB)
            .withPhone(VALID_PHONE_BOB).withEmail(VALID_EMAIL_BOB).withDepartment(VALID_DEPARTMENT_BOB)
            .withRole(VALID_ROLE_BOB).withSalary(VALID_SALARY_BOB).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
