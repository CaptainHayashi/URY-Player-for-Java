/**
 * This file is part of URY Player for Java.
 * Copyright (C) 2010 Matt Windsor, URY Computing
 * 
 * URY Player for Java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the 
 * Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version.
 *
 * URY Player for Java is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General 
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * URY Player for Java.  If not, see <http://www.gnu.org/licences/>.
 */

package uryPlayer.core;


/**
 * An interface for a URY stream player.
 * 
 * The stream player hosts a PlayerCore, which is responsible for the actual
 * stream playback, and provides an interface to let the PlayerCore know when 
 * to stop playing.
 * 
 * @author Matt Windsor
 */


public interface URYStreamPlayer
{
  /**
   * Get whether or not the PlayerCore should be running.
   * @return  true if the player is expected to be running, false otherwise.
   */
  
  public boolean
  isRunning ();
  
  
  /**
   * Start the attached player, if it is running.
   */
  
  public void
  startPlayer ();
  
  
  /**
   * Stop the attached player, if it is running.
   */
  
  public void
  stopPlayer ();


  /**
   * Change the URL of the stream the player is streaming from.
   * @param newURL  The new stream URL.
   */
  
  public void 
  changePlayerURL (String newURL);
}
