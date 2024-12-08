package ru.evendot;

public interface SearchService {
    /**
     * Поиск животных с високосным годом рождения
     * 
     * @param animals всех животных
     * @return Массив найденных по условию животных
     */
    public AbstractAnimal[] findLeapYearNames(AbstractAnimal[] animals);

    /**
     * Поиск животных, старше заданного года
     * 
     * @param animals Массив всех животных
     * @param N       Заданное количество лет
     * @return Массив найденных по условию животных
     */
    public AbstractAnimal[] findOlderAnimal(AbstractAnimal[] animals, int N);

    /**
     * Поиск одинаковвых объектов животных
     * 
     * @param animals Массив всех животных
     */
    public void findDuplicate(AbstractAnimal[] animals);
}