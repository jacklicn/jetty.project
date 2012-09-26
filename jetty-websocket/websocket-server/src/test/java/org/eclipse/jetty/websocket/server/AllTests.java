//
//  ========================================================================
//  Copyright (c) 1995-2012 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.websocket.server;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
{ org.eclipse.jetty.websocket.server.ab.AllTests.class, ChromeTest.class, DeflateExtensionTest.class, FragmentExtensionTest.class, IdentityExtensionTest.class,
        LoadTest.class, WebSocketInvalidVersionTest.class, WebSocketLoadRFC6455Test.class, WebSocketOverSSLTest.class, WebSocketServletRFCTest.class })
public class AllTests
{
    /* let junit do the rest */
}
