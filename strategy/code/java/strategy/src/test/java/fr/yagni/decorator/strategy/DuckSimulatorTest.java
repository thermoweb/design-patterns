package fr.yagni.decorator.strategy;


import org.junit.jupiter.api.Test;

import fr.yagni.decorator.strategy.fly.FlyWithWingsStrategy;
import fr.yagni.decorator.strategy.quack.SimpleQuackStrategy;
import nl.altindag.log.LogCaptor;

import static org.assertj.core.api.BDDAssertions.then;


class DuckSimulatorTest {

    @Test
    void should_quackAndFlyCorrectly_when_createSimpleDuck() {
        LogCaptor logCaptor = LogCaptor.forClass(Duck.class);
        Duck duck = new Duck(new SimpleQuackStrategy(), new FlyWithWingsStrategy());
        duck.quack();
        duck.fly();

        then(logCaptor.getInfoLogs())
                .hasSize(2)
                .contains("Quack !",
                        "I'm flying with my wiiiiiiiiiings !");
    }
}