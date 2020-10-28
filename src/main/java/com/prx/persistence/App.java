/*
 *  @(#)App.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prx.persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
public final class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    private App(){}

    public static void main(String[] args) {
        LOGGER.info("Hello World!");
    }
    
}
