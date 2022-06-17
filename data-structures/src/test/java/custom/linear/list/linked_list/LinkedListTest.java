package custom.linear.list.linked_list;

import org.junit.jupiter.api.Test;

import static java.util.Objects.nonNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {

    @Test
    void should_create_custom_linked_list() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        assertTrue(nonNull(linkedList));
    }

    @Test
    void should_add_linked_list() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(5);
        assertEquals(5, (int) linkedList.head.getData());
    }

    @Test
    void should_delete_data_from_linked_list() {
        // given:
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(5);
        // when:
        linkedList.deleteNode(5);
        // then:
        assertTrue(linkedList.isEmpty());
    }

}
