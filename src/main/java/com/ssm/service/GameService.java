package com.ssm.service;

import com.ssm.domain.VZyGame;
import com.ssm.exception.ZdyException;

import java.util.List;

public interface GameService {

    List<VZyGame> getlist() throws ZdyException;
}
