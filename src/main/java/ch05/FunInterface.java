import ch05._01FunInterfaceKt;
import kotlin.Unit;

void main() {
    _01FunInterfaceKt.consumeHello(s -> System.out.println(s.toUpperCase()));
    _01FunInterfaceKt.consumeHelloFunctional(s -> {
        System.out.println(s.toUpperCase());
        return Unit.INSTANCE;
    });
}
