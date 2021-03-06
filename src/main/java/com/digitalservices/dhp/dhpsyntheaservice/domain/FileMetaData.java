/* Created by Perspecta http://www.perspecta.com */
/*
        Licensed to the Apache Software Foundation (ASF) under one
        or more contributor license agreements.  See the NOTICE file
        distributed with this work for additional information
        regarding copyright ownership.  The ASF licenses this file
        to you under the Apache License, Version 2.0 (the
        "License"); you may not use this file except in compliance
        with the License.  You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing,
        software distributed under the License is distributed on an
        "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
        KIND, either express or implied.  See the License for the
        specific language governing permissions and limitations
        under the License.
*/
package com.digitalservices.dhp.dhpsyntheaservice.domain;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

/**
 * Represents the metadata for display and retrieval.
 */
public class FileMetaData {

    private String patientName;
    private String fileName;
    private int resourceCount;
    private Set<String> problems;

    public FileMetaData() {
        this.problems = new HashSet<String>();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    /**
     * @return the resourceCount
     */
    public int getResourceCount() {
        return resourceCount;
    }

    /**
     * @param resourceCount the resourceCount to set
     */
    public void setResourceCount(int resourceCount) {
        this.resourceCount = resourceCount;
    }

   
    public Set<String> getProblems() {
        return this.problems;
    }

    public void setProblems(Set<String> inProblems) {
        this.problems.addAll(inProblems);
    }

    @Override
    public String toString() {
        return "FileMetaData{" +
                "patientName='" + patientName + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileMetaData that = (FileMetaData) o;
        return Objects.equals(patientName, that.patientName) &&
                Objects.equals(fileName, that.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientName, fileName);
    }
}