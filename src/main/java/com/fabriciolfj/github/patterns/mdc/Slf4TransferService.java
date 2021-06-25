package com.fabriciolfj.github.patterns.mdc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4TransferService extends TransferService {

    private Logger logger = LoggerFactory.getLogger(Slf4TransferService.class);

    @Override
    protected void beforeTransfer(long amount) {
        logger.info("Preparing to transfer " + amount + "$.");
    }

    @Override
    protected void afterTransfer(long amount, boolean outcome) {
        logger.info(
                "Has transfer of " + amount + "$ completed successfully ? " + outcome + ".");
    }
}
