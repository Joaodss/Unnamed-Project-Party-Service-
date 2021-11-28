package com.ironhack.partymanagerservice.controller;

import com.ironhack.partymanagerservice.dto.CharacterDTO;
import com.ironhack.partymanagerservice.dto.LevelUpDTO;

import java.util.List;

public interface PartyManagerController {

    List<CharacterDTO> getParty(String username);

    List<CharacterDTO> getGraveyard(String username);

    CharacterDTO getCharacterById(String username, Long id);

    CharacterDTO levelUpCharacter(String username, LevelUpDTO levelUpDTO);

    CharacterDTO healCharacter(String username, Long id, Integer healAmount);

    CharacterDTO reviveCharacter(String username, Long id);

    void removeCharacter(String username, Long id);

}
