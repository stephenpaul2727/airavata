/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
*/
package org.apache.airavata.registry.core.entities.appcatalog;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The persistent class for the storage_interface database table.
 */
@Entity
@Table(name = "STORAGE_INTERFACE")
public class StorageInterfaceEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private StorageInterfacePK id;

    @Column(name = "CREATION_TIME")
    private Timestamp creationTime;

    @Column(name = "DATA_MOVEMENT_PROTOCOL")
    private String dataMovementProtocol;

    @Column(name = "PRIORITY_ORDER")
    private int priorityOrder;

    @Column(name = "UPDATE_TIME")
    private Timestamp updateTime;

    public StorageInterfaceEntity() {
    }

    public StorageInterfacePK getId() {
        return id;
    }

    public void setId(StorageInterfacePK id) {
        this.id = id;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    public String getDataMovementProtocol() {
        return dataMovementProtocol;
    }

    public void setDataMovementProtocol(String dataMovementProtocol) {
        this.dataMovementProtocol = dataMovementProtocol;
    }

    public int getPriorityOrder() {
        return priorityOrder;
    }

    public void setPriorityOrder(int priorityOrder) {
        this.priorityOrder = priorityOrder;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}