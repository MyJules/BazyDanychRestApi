package com.rest.SpringBackend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Student {
    private @Id @GeneratedValue Long _id;
    private String _firstName;
    private String _secondName;
    private String _email;
    private String _phoneNumber;

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_phoneNumber() {
        return _phoneNumber;
    }

    public void set_phoneNumber(String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_secondName() {
        return _secondName;
    }

    public void set_secondName(String _secondName) {
        this._secondName = _secondName;
    }

    public Student(){}

    public Student(String _firstName, String _secondName, String _email, String _phoneNumber) {
        this._firstName = _firstName;
        this._secondName = _secondName;
        this._email = _email;
        this._phoneNumber = _phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(_id, student._id) && Objects.equals(_firstName, student._firstName) && Objects.equals(_secondName, student._secondName) && Objects.equals(_email, student._email) && Objects.equals(_phoneNumber, student._phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id, _firstName, _secondName, _email, _phoneNumber);
    }

    @Override
    public String toString() {
        return String.format("String(id = %d, firstName = %s, secondName = %s, email = %s, phoneNumber = %s)", _id, _firstName, _secondName, _email, _phoneNumber);
    }
}
