const MediapipeTasksVision = require('./NativeMediapipeTasksVision').default;

export function multiply(a: number, b: number): number {
  return MediapipeTasksVision.multiply(a, b);
}
