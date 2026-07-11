package com.MyProject.HospitalManagement.DTO;

import com.MyProject.HospitalManagement.Entity.Type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {

    private final BloodGroupType bloodGroupType;
    private final Long count;
}
