package entities;

import entities.Store;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-01T08:59:19")
@StaticMetamodel(Staff.class)
public class Staff_ { 

    public static volatile SingularAttribute<Staff, String> firstName;
    public static volatile SingularAttribute<Staff, String> lastName;
    public static volatile SingularAttribute<Staff, String> password;
    public static volatile SingularAttribute<Staff, Date> lastUpdate;
    public static volatile SingularAttribute<Staff, Boolean> active;
    public static volatile SingularAttribute<Staff, Store> store;
    public static volatile SingularAttribute<Staff, Store> storeId;
    public static volatile SingularAttribute<Staff, Short> staffId;
    public static volatile SingularAttribute<Staff, byte[]> picture;
    public static volatile SingularAttribute<Staff, String> email;
    public static volatile SingularAttribute<Staff, String> username;

}