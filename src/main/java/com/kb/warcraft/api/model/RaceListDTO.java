package com.kb.warcraft.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class RaceListDTO {

    private List<RaceDTO> raceList;

}
