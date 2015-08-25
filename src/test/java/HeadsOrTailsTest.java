import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class HeadsOrTailsTest {

	@Test
	public void TryToGenerateHead() {
		HeadsOrTails h = new HeadsOrTails();
		
		Assert.assertThat(h.headsOrTails(), either(is("Head")).or(is("Tail")));
	}

}
