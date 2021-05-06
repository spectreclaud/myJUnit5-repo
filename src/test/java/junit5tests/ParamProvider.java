package junit5tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParamProvider {

    static Stream<Arguments> sourceStream_StringDouble() {
        //processing done here
        return Stream.of(arguments("apple", 8.3), arguments("fruit", 6.3), arguments("cherry", 1.9));
    }
}
