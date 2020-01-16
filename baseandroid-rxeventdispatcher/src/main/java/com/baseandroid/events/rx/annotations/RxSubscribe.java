/*
 * Copyright (C) 2020 Sysdata Digital, S.r.l.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baseandroid.events.rx.annotations;

import com.baseandroid.events.rx.RxBus;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a method as an event handler, as used by {@link RxAnnotatedHandlerFinder} and {@link RxBus}.
 *
 * <p>The method's first (and only) parameter defines the event type.
 * <p>If this annotation is applied to methods with zero parameters or more than one parameter, the object containing
 * the method will not be able to register for event delivery from the {@link RxBus}. Otto fails fast by throwing
 * runtime exceptions in these cases.
 *
 * @author Andrea Guitto
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RxSubscribe {
}
