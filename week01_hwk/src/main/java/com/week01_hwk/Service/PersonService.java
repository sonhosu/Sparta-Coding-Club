package com.week01_hwk.Service;

import com.week01_hwk.PersonRequestDto.PersonRequestDto;
import com.week01_hwk.Repository.PersonRepository;
import com.week01_hwk.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor

public class PersonService {

    private final PersonRepository personRepository;

    @Transactional
    public Long update(Long id, PersonRequestDto requestDto) {
        Person person = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디는 존재하지 않습니다.")
        );
        person.update(requestDto);
        return person.getId();


    }

}


