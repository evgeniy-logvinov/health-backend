package ru.virushhack.health.headache;

import ru.virushhack.health.selection.PeriodSelection;

/**
 * Первый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-6.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step1 extends BaseStep {

    public static final String ID = "STEP1";
    public static final String QUESTION = "Как долго это Вас беспокоит?";

    public Step1() {
        super(ID, QUESTION, PeriodSelection.values, false);
    }
}