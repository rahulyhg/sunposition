/* 
 * 
 * Sun Position Calculations
 * http://github.com/sualeh/sunposition
 * Copyright (c) 2007-2014, Sualeh Fatehi.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * 
 */
package us.fatehi.calculation;


/**
 * Create an instance of a sunrise/ sunset algorithm.
 * 
 * @author Sualeh Fatehi
 */
public final class SunPositionAlgorithmFactory
{

  private static final ExtendedSunPositionAlgorithm sunPositionAlgorithm = new CobbledSunCalc();

  /**
   * Create an instance of a sunrise/ sunset algorithm.
   * 
   * @return Instance of a sunrise/ sunset algorithm.
   */
  public static SunPositionAlgorithm getInstance()
  {
    return sunPositionAlgorithm;
  }

  /**
   * Create an instance of a sunrise/ sunset algorithm.
   * 
   * @return Instance of a sunrise/ sunset algorithm.
   */
  public static ExtendedSunPositionAlgorithm getExtendedSunPositionAlgorithmInstance()
  {
    return sunPositionAlgorithm;
  }

  private SunPositionAlgorithmFactory()
  {
    // Prevent instantiation
  }

}
