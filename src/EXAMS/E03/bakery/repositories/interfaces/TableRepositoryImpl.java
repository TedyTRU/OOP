package EXAMS.E03.bakery.repositories.interfaces;

import EXAMS.E03.bakery.entities.tables.interfaces.Table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TableRepositoryImpl implements TableRepository<Table> {
    private Collection<Table> models;

    public TableRepositoryImpl() {
        this.models = new ArrayList<>();
    }

    @Override
    public Table getByNumber(int number) {
        return this.models.stream()
                .filter(b -> b.getTableNumber() == number)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Collection<Table> getAll() {
        return Collections.unmodifiableCollection(this.models);
    }

    @Override
    public void add(Table table) {
        this.models.add(table);
    }
}
