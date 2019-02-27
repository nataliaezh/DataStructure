package Lesson4;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkIteratorApp {
      import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

    public class  LinkIteratorApp {
        @Test
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insert(6);
        linkedList.insert(7);
        linkedList.insert(8);
        linkedList.insert(9);
        linkedList.insert(10);

            Assert.assertThat(linkedList.size(),   Is.is(5));
            Assert.assertThat(linkedList.peek(),   Is.is(10));
    }
    @Test
    LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insert(6);
        linkedList.insert(7);
        linkedList.insert(8);
        linkedList.insert(9);
        linkedList.insert(10);

                linkedList.remove(6);

            Assert.assertThat(linkedList.size(),   Is.is(5));
            Assert.assertThat(linkedList.remove(),   Is.is(6));
            Assert.assertThat(linkedList.size(),   Is.is(4));
}

                }
}
