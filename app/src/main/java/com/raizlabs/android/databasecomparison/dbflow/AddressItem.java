package com.raizlabs.android.databasecomparison.dbflow;

import com.raizlabs.android.databasecomparison.IAddressItem;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKeyReference;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.raizlabs.android.dbflow.structure.container.ForeignKeyContainer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Description:
 */
@Table(databaseName = DBFlowDatabase.NAME)
public class AddressItem extends BaseModel implements IAddressItem<AddressBook> {

    @Column(columnType = Column.PRIMARY_KEY_AUTO_INCREMENT)
    long id;

    @Column(name = "name")
    String name;

    @Column(name = "address")
    String address;

    @Column(name = "city")
    String city;

    @Column(name = "state")
    String state;

    @Column(name = "phone")
    long phone;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public void saveAll() {
        super.insert(false);
    }

    @Column(name = "addressBook", columnType = Column.FOREIGN_KEY,
            references = {@ForeignKeyReference(columnName = "addressBook", columnType = long.class, foreignColumnName = "id")},
            saveForeignKeyModel = false)
    ForeignKeyContainer<AddressBook> addressBook;


    @Override
    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = new ForeignKeyContainer<>(AddressBook.class);
        Map<String, Object> keys = new LinkedHashMap<>();
        keys.put(AddressBook$Table.ID, addressBook.id);
        this.addressBook.setData(keys);
    }
}
