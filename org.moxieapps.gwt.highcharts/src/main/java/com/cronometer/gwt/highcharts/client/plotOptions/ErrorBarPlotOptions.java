/*
 * Copyright 2013 Moxie Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cronometer.gwt.highcharts.client.plotOptions;

import com.cronometer.gwt.highcharts.client.Chart;
import com.cronometer.gwt.highcharts.client.Series;

/**
 * Represents the general plot options available for all error bar type series, which can be set either generically
 * on the chart via the {@link Chart#setErrorBarPlotOptions(ErrorBarPlotOptions)} )} method or directly on a
 * series via the {@link Series#setPlotOptions(PlotOptions)} method.
 * <p/>
 * Note that these options are only needed if you want to specifically control the general options
 * for all error bar type series in the entire chart.  If you instead want to control the options for all
 * series in the chart (not just those of an error bar type), then you can use the {@link SeriesPlotOptions}
 * class instead.  Or, if you want to control the plot options for just one series (and not all error bar type
 * series in the chart), use the {@link com.cronometer.gwt.highcharts.client.Series#setPlotOptions(PlotOptions)} method.
 *
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since 1.6.0
 */

public class ErrorBarPlotOptions extends BaseStatisticalPlotOptions<ErrorBarPlotOptions> {

    // Everything we need is inherited from our base class, so this class is really only needed to
    // handle setting the correct generic type (so the user doesn't need to deal with the type manually)

}
