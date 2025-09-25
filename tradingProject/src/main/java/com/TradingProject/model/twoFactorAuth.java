package com.TradingProject.model;

import com.TradingProject.domain.VERIFICATION_TYPE;
import lombok.Data;

@Data
public class twoFactorAuth {
    private boolean isEnabled = false;
    private VERIFICATION_TYPE sendTo;
}
