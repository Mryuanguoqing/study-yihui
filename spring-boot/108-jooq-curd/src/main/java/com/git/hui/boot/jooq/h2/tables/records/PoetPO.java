/*
 * This file is generated by jOOQ.
 */
package com.git.hui.boot.jooq.h2.tables.records;


import com.git.hui.boot.jooq.h2.tables.PoetTB;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PoetPO extends UpdatableRecordImpl<PoetPO> implements Record2<Integer, String> {

    private static final long serialVersionUID = -242235690;

    /**
     * Setter for <code>PUBLIC.POET.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.POET.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.POET.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.POET.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PoetTB.POET.ID;
    }

    @Override
    public Field<String> field2() {
        return PoetTB.POET.NAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public PoetPO value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PoetPO value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public PoetPO values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PoetPO
     */
    public PoetPO() {
        super(PoetTB.POET);
    }

    /**
     * Create a detached, initialised PoetPO
     */
    public PoetPO(Integer id, String name) {
        super(PoetTB.POET);

        set(0, id);
        set(1, name);
    }
}
